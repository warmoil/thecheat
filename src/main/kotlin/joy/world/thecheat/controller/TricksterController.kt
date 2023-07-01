package joy.world.thecheat.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/tricksters")
@Tag(name = "사기꾼 관련 ")
class TricksterController {

    @Operation(summary = "전화번호 or 계좌번호로  사기 이력 조회")
    @GetMapping
    fun getListByPhoneNumOrAccountNum(@RequestParam phoneOrAccount: String): ResponseEntity<String> {
        return ResponseEntity.internalServerError().build()
    }


}