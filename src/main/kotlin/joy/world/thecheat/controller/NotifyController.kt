package joy.world.thecheat.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/notifies")
@Tag(name = "신고관련")
class NotifyController {

    @Operation(summary = "신고 내역 등록")
    @PostMapping
    fun relatorTrickster(): ResponseEntity<String> {
        return ResponseEntity.internalServerError().build()
    }

    @Operation(summary = "등록한 신고 삭제")
    @DeleteMapping("/{id}")
    fun deleteNotify(@PathVariable id: Long): ResponseEntity<String> {
        return ResponseEntity.internalServerError().build()
    }

    @Operation(summary = "내 신고 내역 조회")
    @GetMapping("/my")
    fun getMyNotifies():ResponseEntity<String>{
        return ResponseEntity.internalServerError().build()
    }
}