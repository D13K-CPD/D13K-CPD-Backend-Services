package com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate;

import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseImageDTO;
import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImagePaginateResponseDTO {
    private List<ResponseImageDTO> imageDataList;
    private long imageDataCount;
}
