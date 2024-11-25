@Component
public class MissionConverter {

    public Mission toMission(MissionRequestDto requestDto, Store store) {
        return Mission.builder()
                .missionSpec(requestDto.getMissionSpec())
                .reward(requestDto.getReward())
                .deadline(requestDto.getDeadline())
                .store(store)
                .build();
    }

    public MissionResponseDto toResponseDto(Mission mission) {
        return MissionResponseDto.builder()
                .missionId(mission.getId())
                .missionSpec(mission.getMissionSpec())
                .reward(mission.getReward())
                .deadline(mission.getDeadline())
                .storeId(mission.getStore().getId())
                .build();
    }
}
