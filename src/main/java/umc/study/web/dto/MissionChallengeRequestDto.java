@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MissionChallengeRequestDto {

    @NotNull(message = "Member ID is required")
    private Long memberId;
}
