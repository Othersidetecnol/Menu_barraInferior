import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.menu_barrainferior.R

data class Service(
    val title: String,
    val city: String,
    val category: String
)

class ServicesAdapter(private val servicesList: List<Service>) : RecyclerView.Adapter<ServicesAdapter.ServiceViewHolder>() {

    class ServiceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val serviceTitle: TextView = itemView.findViewById(R.id.serviceTitle)
        val serviceCity: TextView = itemView.findViewById(R.id.serviceCity)
        val serviceCategory: TextView = itemView.findViewById(R.id.serviceCategory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_service, parent, false)
        return ServiceViewHolder(view)
    }

    override fun onBindViewHolder(holder: ServiceViewHolder, position: Int) {
        val service = servicesList[position]
        holder.serviceTitle.text = service.title
        holder.serviceCity.text = service.city
        holder.serviceCategory.text = service.category
    }

    override fun getItemCount(): Int {
        return servicesList.size
    }
}
