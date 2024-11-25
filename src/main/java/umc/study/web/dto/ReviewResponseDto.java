@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewResponseDto {

    private Long reviewId;
    private Long storeId;
    private String title;
    private Float score;
}
