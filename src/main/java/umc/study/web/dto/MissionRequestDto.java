@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MissionRequestDto {

    @NotBlank(message = "Mission description is required")
    private String missionSpec;

    @NotNull(message = "Reward is required")
    @Min(1)
    private Integer reward;

    @NotNull(message = "Deadline is required")
    private LocalDate deadline;
}
