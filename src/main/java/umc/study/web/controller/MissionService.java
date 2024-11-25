@RestController
@RequestMapping("/api/stores")
@RequiredArgsConstructor
public class MissionController {

    private final MissionService missionService;

    @PostMapping("/{storeId}/missions")
    public ResponseEntity<MissionResponseDto> addMission(
            @PathVariable Long storeId,
            @RequestBody @Valid MissionRequestDto requestDto) {
        MissionResponseDto responseDto = missionService.addMission(storeId, requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }
}
