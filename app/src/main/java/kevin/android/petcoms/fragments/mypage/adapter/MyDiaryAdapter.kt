package kevin.android.petcoms.fragments.mypage.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kevin.android.petcoms.databinding.ListMyDiaryBinding
import kevin.android.petcoms.fragments.mypage.model.MyDiary

class MyDiaryAdapter() : RecyclerView.Adapter<MyDiaryAdapter.MyDiaryViewHolder>() {

    var myDiaryList = mutableListOf<MyDiary>()

    class MyDiaryViewHolder(private val binding: ListMyDiaryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(currentMyDiary: MyDiary) {
            binding.myDiary = currentMyDiary
        }
//        fun bind(myDiary: MyDiary){
//            binding.dUserNickname.text = myDiary.title
//            binding.dContents.text = myDiary.body
//        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDiaryViewHolder {
        val binding = ListMyDiaryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyDiaryViewHolder(binding)
//        val binding = ListMyDiaryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return MyDiaryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyDiaryViewHolder, position: Int) {
        holder.bind(myDiaryList[position])
//        val myDiary: MyDiary = myDiaryList[position]
//        holder.bind(myDiary)
    }

    override fun getItemCount(): Int {
        return myDiaryList.size
    }

    fun setData(data : MutableList<MyDiary>){
        myDiaryList = data
        notifyDataSetChanged()
    }

}