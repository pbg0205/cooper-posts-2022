package com.cooper.cooperposts2022.posts.application;

import com.cooper.cooperposts2022.posts.domain.Post;
import com.cooper.cooperposts2022.posts.domain.PostRepository;
import com.cooper.cooperposts2022.posts.dto.PostCreateRequestDto;
import com.cooper.cooperposts2022.posts.dto.PostCreateResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostCreateServiceImpl implements PostCreateService {

    private final PostRepository postRepository;

    @Override
    public PostCreateResponseDto createPost(PostCreateRequestDto postCreateRequestDto) {
        Post post = postRepository.save(postCreateRequestDto.toEntity());
        return PostCreateResponseDto.fromEntity(post);
    }

}
