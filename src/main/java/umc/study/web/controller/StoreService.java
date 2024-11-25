@RestController
@RequestMapping("/api/regions")
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    @PostMapping("/{regionId}/stores")
    public ResponseEntity<StoreResponseDto> addStore(
            @PathVariable Long regionId,
            @RequestBody @Valid StoreRequestDto requestDto) {
        StoreResponseDto responseDto = storeService.addStore(regionId, requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }
}
