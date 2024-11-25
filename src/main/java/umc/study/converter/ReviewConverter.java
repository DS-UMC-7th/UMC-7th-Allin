@Component
public class ReviewConverter {

    public Review toReview(ReviewRequestDto requestDto, Store store) {
        return Review.builder()
                .title(requestDto.getTitle())
                .score(requestDto.getScore())
                .store(store)
                .build();
    }

    public ReviewResponseDto toResponseDto(Review review) {
        return ReviewResponseDto.builder()
                .reviewId(review.getId())
                .storeId(review.getStore().getId())
                .title(review.getTitle())
                .score(review.getScore())
                .build();
    }
}
