@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewRequestDto {

    @NotBlank(message = "Review title is required")
    private String title;

    @NotNull(message = "Score is required")
    @Min(1)
    @Max(5)
    private Float score;
}
