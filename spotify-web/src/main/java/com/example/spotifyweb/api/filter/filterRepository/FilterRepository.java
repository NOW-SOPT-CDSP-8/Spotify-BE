package com.example.spotifyweb.api.filter.filterRepository;

import com.example.spotifyweb.api.filter.domain.Filter;
import com.example.spotifyweb.global.common.exception.NotFoundException;
import com.example.spotifyweb.global.common.response.ErrorMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilterRepository extends JpaRepository<Filter, Long> {

    default Filter findByIdOrThrow(Long filterId) throws NotFoundException {
        return findById(filterId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.FILTER_NOT_FOUND_BY_ID_EXCEPTION));
    }
}
