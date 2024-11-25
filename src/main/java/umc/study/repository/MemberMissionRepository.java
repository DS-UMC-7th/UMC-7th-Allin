@Repository
public interface MemberMissionRepository extends JpaRepository<MemberMission, Long> {

    boolean existsByMissionIdAndMemberId(Long missionId, Long memberId);
}
