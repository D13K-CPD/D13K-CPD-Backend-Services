package com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate;

import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDTO;
import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressPaginateResponseDTO {
    private List<ResponseAddressDTO> addressDataList;
    private long addressDataCount;
}
