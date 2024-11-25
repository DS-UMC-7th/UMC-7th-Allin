@RestController
@RequestMapping("/api/missions")
@RequiredArgsConstructor
public class MissionChallengeController {

    private final MissionChallengeService missionChallengeService;

    @PostMapping("/{missionId}/challenge")
    public ResponseEntity<MemberMissionResponseDto> challengeMission(
            @PathVariable Long missionId,
            @RequestBody @Valid MissionChallengeRequestDto requestDto) {
        MemberMissionResponseDto responseDto = missionChallengeService.challengeMission(missionId, requestDto.getMemberId());
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }
}
