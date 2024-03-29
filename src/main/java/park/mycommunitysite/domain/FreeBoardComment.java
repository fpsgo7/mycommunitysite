package park.mycommunitysite.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "free_board_comment")
@Getter
public class FreeBoardComment extends BaseTimeEntity{

    @Id
    @GeneratedValue
    @Column(name = "free_board_comment_id")
    private Long id;

    private String content;
    private int reported;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "free_board_post_id")
    private FreeBoardPost freeBoardPost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private FreeBoardComment parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<FreeBoardComment> children= new ArrayList<>();

}