@Component
public class MemberMissionConverter {

    public MemberMission toMemberMission(Mission mission, Long memberId) {
        return MemberMission.builder()
                .mission(mission)
                .memberId(memberId)
                .status("CHALLENGED")
                .build();
    }

    public MemberMissionResponseDto toResponseDto(MemberMission memberMission) {
        return MemberMissionResponseDto.builder()
                .missionId(memberMission.getMission().getId())
                .memberId(memberMission.getMemberId())
                .status(memberMission.getStatus())
                .build();
    }
}
