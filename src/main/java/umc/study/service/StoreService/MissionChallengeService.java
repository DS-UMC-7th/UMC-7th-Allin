@Service
@RequiredArgsConstructor
public class MissionChallengeService {

    private final MemberMissionRepository memberMissionRepository;
    private final MissionRepository missionRepository;
    private final MemberMissionConverter memberMissionConverter;

    public MemberMissionResponseDto challengeMission(Long missionId, Long memberId) {
        // Validate mission exists
        Mission mission = missionRepository.findById(missionId)
                .orElseThrow(() -> new IllegalArgumentException("Mission not found"));

        // Check if the member is already challenging the mission
        if (memberMissionRepository.existsByMissionIdAndMemberId(missionId, memberId)) {
            throw new IllegalStateException("This mission is already challenged by the member.");
        }

        // Create and save the challenge
        MemberMission memberMission = memberMissionConverter.toMemberMission(mission, memberId);
        memberMissionRepository.save(memberMission);

        return memberMissionConverter.toResponseDto(memberMission);
    }
}
