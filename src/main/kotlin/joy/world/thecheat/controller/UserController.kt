package joy.world.thecheat.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
@Tag(name = "유저 관련")
class UserController {

    @Operation(summary = "회원가입 입니다.")
    @PostMapping("/register")
    fun createUser(): ResponseEntity<Long> {
        return ResponseEntity.internalServerError().build()
    }

    @Operation(summary = "로그인입니다.")
    @PostMapping("/login")
    fun login(): ResponseEntity<Long> {
        return ResponseEntity.internalServerError().build()
    }
}