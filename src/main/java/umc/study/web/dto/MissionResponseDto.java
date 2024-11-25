@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MissionResponseDto {

    private Long missionId;
    private String missionSpec;
    private Integer reward;
    private LocalDate deadline;
    private Long storeId;
}
