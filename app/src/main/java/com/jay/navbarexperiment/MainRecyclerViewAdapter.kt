package com.jay.navbarexperiment

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.jay.navbarexperiment.models.User

class MainRecyclerViewAdapter(private val context: Context, users: ArrayList<User>) : RecyclerView.Adapter<MainRecyclerViewAdapter.ViewHolder>(){
    companion object{
        private val TAG = "com.jay.navbarexperiment.MainRecyclerViewAdapter"
    }
    //vars
    private var mUsers : ArrayList<User> = ArrayList<User>()
//    private var mInterface: IMainActivity? = null
    init {
        mUsers = users
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_main_feed, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        Log.d(TAG, "onBindViewHolder: called.")
        val userP =mUsers[position]

        val requestOptions: RequestOptions = RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)

        Glide.with(context)
            .load(userP.profile_image)
            .apply(requestOptions)
            .into(holder.image)
        holder.name.text = userP.name
        holder.interested_in.text = userP.interested_in
        holder.status.text =  userP.status
        holder.cardView.setOnClickListener(View.OnClickListener {
            Log.d(TAG, "onClick: clicked on: " + userP.name)
//            mInterface?.inflateViewProfileFragment(userP)
        })    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
//        mInterface = context as IMainActivity
    }

    override fun getItemCount(): Int = mUsers.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var name: TextView
        var interested_in: TextView
        var status: TextView
        var cardView: CardView

        init {
            image = itemView.findViewById(R.id.profile_image)
            name = itemView.findViewById(R.id.name)
            interested_in = itemView.findViewById(R.id.interested_in)
            status = itemView.findViewById(R.id.status)
            cardView = itemView.findViewById(R.id.card_view)
        }
    }
}
