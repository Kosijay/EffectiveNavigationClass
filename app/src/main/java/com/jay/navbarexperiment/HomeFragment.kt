package com.jay.navbarexperiment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.jay.navbarexperiment.models.User

import com.jay.navbarexperiment.util.Users


class HomeFragment : Fragment() {
    private val TAG = "HomeFragment"
    //constants
    private val NUM_COLUMNS = 2
    private var mRecyclerView : RecyclerView? = null
    private val mMatches: ArrayList<User> = ArrayList<User>()
    private var mStaggeredGridLayoutManager : StaggeredGridLayoutManager? = null
    private var mRecyclerViewAdapter: MainRecyclerViewAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View { val view =  inflater.inflate(R.layout.fragment_home, container, false)
        Log.d(TAG, "onCreateView: started")
        mRecyclerView = view.findViewById(R.id.recycler_view)
        findMatches()
        return view
    }

    private fun findMatches() {
        val users = User
        if (mMatches != null){
            mMatches.clear()
        }
/*        for (user in users.USERS) {
            mMatches?.add(user)
        }*/
        if (mRecyclerViewAdapter == null){
            initRecyclerView()
        }
    }

    private fun initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.")
        mStaggeredGridLayoutManager =
            StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL)
        mRecyclerView?.layoutManager = mStaggeredGridLayoutManager
        mRecyclerViewAdapter = MainRecyclerViewAdapter(requireActivity(), mMatches)
        mRecyclerView?.adapter = mRecyclerViewAdapter
    }


}
