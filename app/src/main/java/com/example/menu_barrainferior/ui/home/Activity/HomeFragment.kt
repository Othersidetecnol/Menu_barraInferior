import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.menu_barrainferior.R
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var servicesAdapter: ServicesAdapter
    private lateinit var database: FirebaseDatabase
    private lateinit var servicesList: MutableList<Service>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewServices)
        recyclerView.layoutManager = LinearLayoutManager(context)

        servicesList = mutableListOf()
        servicesAdapter = ServicesAdapter(servicesList)
        recyclerView.adapter = servicesAdapter

        database = FirebaseDatabase.getInstance()
        val servicesRef = database.getReference("services")

        servicesRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                servicesList.clear()
                for (serviceSnapshot in snapshot.children) {
                    val service = serviceSnapshot.getValue(Service::class.java)
                    if (service != null) {
                        servicesList.add(service)
                    }
                }
                servicesAdapter.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle error
            }
        })

        return view
    }
}
