package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
public class MediationAdRequest {
    private final Date zzha;
    private final Gender zzhb;
    private final Set<String> zzhc;
    private final boolean zzhd;
    private final Location zzhe;

    public MediationAdRequest(Date date, Gender gender, Set<String> set, boolean z, Location location) {
        this.zzha = date;
        this.zzhb = gender;
        this.zzhc = set;
        this.zzhd = z;
        this.zzhe = location;
    }

    public Integer getAgeInYears() {
        if (this.zzha == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(this.zzha);
        Integer valueOf = Integer.valueOf(instance2.get(1) - instance.get(1));
        if (instance2.get(2) < instance.get(2) || (instance2.get(2) == instance.get(2) && instance2.get(5) < instance.get(5))) {
            valueOf = Integer.valueOf(valueOf.intValue() - 1);
        }
        return valueOf;
    }

    public Date getBirthday() {
        return this.zzha;
    }

    public Gender getGender() {
        return this.zzhb;
    }

    public Set<String> getKeywords() {
        return this.zzhc;
    }

    public Location getLocation() {
        return this.zzhe;
    }

    public boolean isTesting() {
        return this.zzhd;
    }
}
