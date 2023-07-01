package joy.world.thecheat.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "trickster")
data class TricksterEntity(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long = 0,
    val phoneOrAccount: String,

    @OneToMany(mappedBy = "trickster")
    val notifyList: List<NotifyEntity>
)