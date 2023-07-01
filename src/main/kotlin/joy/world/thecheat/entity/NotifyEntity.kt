package joy.world.thecheat.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "notify")
data class NotifyEntity(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long = 0,

    @ManyToOne
    // 사기꾼
    val trickster: TricksterEntity,

    @ManyToOne
    // 신고자
    val user: UserEntity,
    // 사기친 경로(사이트)
    val platform: String,
    // 제목
    val title:String,
    // 사기 내용
    val content: String?
)
