@Component
public class StoreConverter {

    public Store toStore(StoreRequestDto requestDto, Region region) {
        return Store.builder()
                .name(requestDto.getName())
                .address(requestDto.getAddress())
                .region(region)
                .build();
    }

    public StoreResponseDto toResponseDto(Store store) {
        return StoreResponseDto.builder()
                .storeId(store.getId())
                .name(store.getName())
                .regionName(store.getRegion().getName())
                .build();
    }
}
