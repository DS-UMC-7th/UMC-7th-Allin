@Service
@RequiredArgsConstructor
public class MissionService {

    private final MissionRepository missionRepository;
    private final StoreRepository storeRepository;
    private final MissionConverter missionConverter;

    public MissionResponseDto addMission(Long storeId, MissionRequestDto requestDto) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new IllegalArgumentException("Store not found"));

        Mission mission = missionConverter.toMission(requestDto, store);
        missionRepository.save(mission);

        return missionConverter.toResponseDto(mission);
    }
}
