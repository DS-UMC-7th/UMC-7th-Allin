@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreRepository storeRepository;
    private final RegionRepository regionRepository;
    private final StoreConverter storeConverter;

    public StoreResponseDto addStore(Long regionId, StoreRequestDto requestDto) {
        Region region = regionRepository.findById(regionId)
                .orElseThrow(() -> new IllegalArgumentException("Region not found"));

        Store store = storeConverter.toStore(requestDto, region);
        storeRepository.save(store);

        return storeConverter.toResponseDto(store);
    }
}
