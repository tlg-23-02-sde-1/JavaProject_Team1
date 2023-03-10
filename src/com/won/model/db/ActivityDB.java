package com.won.model.db;

import com.won.model.activity.Activity;
import com.won.model.activity.Indoor;
import com.won.model.activity.Outdoor;
import com.won.model.activity.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class ActivityDB {
    /*
     * ATTRIBUTES AND FIELDS
     */
    private List<Indoor> indoorActivities = new ArrayList<>();
    private List<Outdoor> outdoorActivities = new ArrayList<>();
    private List<Activity> restaurantActivities = new ArrayList<Activity>();
    //TODO: Rename as city, and simplify the indoor vs outdoor.  Flesh out further and think of it LIKE the DB.

    /*
     * CONSTRUCTORS ---- MAKING SINGLETON
     */
    private static ActivityDB activityDB = null;
    private ActivityDB() {
    }
    public static synchronized ActivityDB getInstance()
    {
        if(activityDB == null) activityDB = new ActivityDB();
        return activityDB;
    }


    /*
     * Methods to add to the activities
     */
    // TODO: Replace with only one add method.
    public void addIndoor(Indoor a){
        indoorActivities.add(a);
    }
    public void addOutdoor(Outdoor a){
        outdoorActivities.add(a);
    }
    public void addRestaurantActivities(Restaurant a){
        restaurantActivities.add(a);
    }



    /*
     * GETTER ONLY
     * TODO: Cycle through and ask instanceof
     *  TODO: Implement the randomizer inside here.
     *   string Activity randActivity(String type --- enum?){ --- pull the activity and pop off original list }
     *      -- COLLECTIONS.SHUFFLE CRIES INSIDE.
     *
     *
     */

    public List<Indoor> getIndoorActivities() {
        return indoorActivities;
    }
    public List<Outdoor> getOutdoorActivities() {
        return outdoorActivities;
    }
    public List<Activity> getRestaurantActivities() {
        return restaurantActivities;
    }

}