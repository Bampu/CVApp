package com.example.cvapp.cv.view.viewpager.fragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cvapp.R
import com.example.cvapp.cv.model.Company

class CompanyListAdapter(private val list: List<Company>) :
    RecyclerView.Adapter<CompanyListAdapter.CompanyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompanyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CompanyViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: CompanyViewHolder, position: Int) {
        val company: Company = list[position]
        holder.bind(company)
    }

    override fun getItemCount(): Int = list.size


    class CompanyViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.company_item, parent, false)) {
        private var companyName: TextView? = null
        private var startDate: TextView? = null
        private var endDate: TextView? = null


        init {
            companyName = itemView.findViewById(R.id.companyName)
            startDate = itemView.findViewById(R.id.startDate)
            endDate = itemView.findViewById(R.id.endDate)
        }

        fun bind(company: Company) {
            companyName?.append(" " + company.companyName)
            startDate?.append(" " + company.startDate)
            endDate?.append(" " + company.endDate)

        }

    }
}