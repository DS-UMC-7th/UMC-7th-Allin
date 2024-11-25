@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final StoreRepository storeRepository;
    private final ReviewConverter reviewConverter;

    public ReviewResponseDto addReview(Long storeId, ReviewRequestDto requestDto) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new IllegalArgumentException("Store not found"));

        Review review = reviewConverter.toReview(requestDto, store);
        reviewRepository.save(review);

        return reviewConverter.toResponseDto(review);
    }
}
