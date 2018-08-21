package com.navis.model;

import java.util.Comparator;
import java.util.Objects;

public class Container implements Comparable{
    String cId;
    String cStatus;
    int isoType;
    int seal;
    int cTareWeight;
    int cPayWeight;
    boolean cDamage;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public int getIsoType() {
        return isoType;
    }

    public void setIsoType(int isoType) {
        this.isoType = isoType;
    }

    public int getSeal() {
        return seal;
    }

    public void setSeal(int seal) {
        this.seal = seal;
    }

    public int getcTareWeight() {
        return cTareWeight;
    }

    public void setcTareWeight(int cTareWeight) {
        this.cTareWeight = cTareWeight;
    }

    public int getcPayWeight() {
        return cPayWeight;
    }

    public void setcPayWeight(int cPayWeight) {
        this.cPayWeight = cPayWeight;
    }

    public boolean iscDamage() {
        return cDamage;
    }

    public void setcDamage(boolean cDamage) {
        this.cDamage = cDamage;
    }

    @Override
    public String toString() {
        return "Container{" +
                "cId='" + cId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return Objects.equals(cId, container.cId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cId);
    }

    void setToChe(String cId)
    {

    }


    @Override
    public int compareTo(Object o) {
        Container ref = (Container) o;
        if (this.getcId().compareTo(ref.getcId())<0)
            return -1;
        else if (this.getcId().compareTo(ref.getcId())>0)
            return 1;
        else
            return 0;
    }
}
