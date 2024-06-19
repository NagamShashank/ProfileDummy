package com.example.profiledummy

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.profiledummy.databinding.ItemlayoutBinding

class UserAdapter(private val context: Context, private val userList : ArrayList<UserData>):
    RecyclerView.Adapter<UserAdapter.viewHolder> () {

    inner class viewHolder( val itemLayoutBinding: ItemlayoutBinding):RecyclerView.ViewHolder(itemLayoutBinding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.viewHolder {
        return viewHolder(ItemlayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: UserAdapter.viewHolder, position: Int) {
        val model = userList[position]
        holder.itemLayoutBinding.apply {
            userName.text = model.empName
            userSubject.text = model.subject
            userImg.setImageResource(model.userImg)
            userDescription.text = model.description
        }

        holder.itemView.setOnClickListener {
            val intent = Intent(context,MainActivity2::class.java)
            intent.putExtra("UserModel",model)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}