package joy.world.thecheat.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "user")
data class UserEntity(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val idx: Long = 0,
    val userId: String,
    val pw: String?,

    @OneToMany(mappedBy = "user")
    val notifyList: List<NotifyEntity>
)