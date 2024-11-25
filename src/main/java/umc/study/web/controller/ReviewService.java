@RestController
@RequestMapping("/api/stores")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping("/{storeId}/reviews")
    public ResponseEntity<ReviewResponseDto> addReview(
            @PathVariable Long storeId,
            @RequestBody @Valid ReviewRequestDto requestDto) {
        ReviewResponseDto responseDto = reviewService.addReview(storeId, requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }
}
