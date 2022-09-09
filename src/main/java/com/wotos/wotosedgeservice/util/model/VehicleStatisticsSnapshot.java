package com.wotos.wotosedgeservice.util.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleStatisticsSnapshot {

    @JsonProperty("vehicle_statistics_snapshot_id")
    private Integer vehicleStatisticsSnapshotId;
    @JsonProperty("account_id")
    private Integer accountId;
    @JsonProperty("vehicle_id")
    private Integer vehicleId;
    @JsonProperty("total_battles")
    private Integer totalBattles;
    @JsonProperty("survived_battles")
    private Integer survivedBattles;
    @JsonProperty("kill_death_ratio")
    private Float killDeathRatio;
    @JsonProperty("hit_miss_ratio")
    private Float hitMissRatio;
    @JsonProperty("win_loss_ratio")
    private Float winLossRatio;
    @JsonProperty("average_wn8")
    private Float averageWn8;
    @JsonProperty("average_experience")
    private Float averageExperience;
    @JsonProperty("average_damage")
    private Float averageDamage;
    @JsonProperty("average_kills")
    private Float averageKills;
    @JsonProperty("average_damage_received")
    private Float averageDamageReceived;
    @JsonProperty("average_shots")
    private Float averageShots;
    @JsonProperty("average_stun_assisted_damage")
    private Float averageStunAssistedDamage;
    @JsonProperty("average_capture_points")
    private Float averageCapturePoints;
    @JsonProperty("average_dropped_capture_points")
    private Float averageDroppedCapturePoints;
    @JsonProperty("average_spotting")
    private Float averageSpotting;

    public Integer getVehicleStatisticsSnapshotId() {
        return vehicleStatisticsSnapshotId;
    }

    public void setVehicleStatisticsSnapshotId(Integer vehicleStatisticsSnapshotId) {
        this.vehicleStatisticsSnapshotId = vehicleStatisticsSnapshotId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getTotalBattles() {
        return totalBattles;
    }

    public void setTotalBattles(Integer totalBattles) {
        this.totalBattles = totalBattles;
    }

    public Integer getSurvivedBattles() {
        return survivedBattles;
    }

    public void setSurvivedBattles(Integer survivedBattles) {
        this.survivedBattles = survivedBattles;
    }

    public Float getKillDeathRatio() {
        return killDeathRatio;
    }

    public void setKillDeathRatio(Float killDeathRatio) {
        this.killDeathRatio = killDeathRatio;
    }

    public Float getHitMissRatio() {
        return hitMissRatio;
    }

    public void setHitMissRatio(Float hitMissRatio) {
        this.hitMissRatio = hitMissRatio;
    }

    public Float getWinLossRatio() {
        return winLossRatio;
    }

    public void setWinLossRatio(Float winLossRatio) {
        this.winLossRatio = winLossRatio;
    }

    public Float getAverageWn8() {
        return averageWn8;
    }

    public void setAverageWn8(Float averageWn8) {
        this.averageWn8 = averageWn8;
    }

    public Float getAverageExperience() {
        return averageExperience;
    }

    public void setAverageExperience(Float averageExperience) {
        this.averageExperience = averageExperience;
    }

    public Float getAverageDamage() {
        return averageDamage;
    }

    public void setAverageDamage(Float averageDamage) {
        this.averageDamage = averageDamage;
    }

    public Float getAverageKills() {
        return averageKills;
    }

    public void setAverageKills(Float averageKills) {
        this.averageKills = averageKills;
    }

    public Float getAverageDamageReceived() {
        return averageDamageReceived;
    }

    public void setAverageDamageReceived(Float averageDamageReceived) {
        this.averageDamageReceived = averageDamageReceived;
    }

    public Float getAverageShots() {
        return averageShots;
    }

    public void setAverageShots(Float averageShots) {
        this.averageShots = averageShots;
    }

    public Float getAverageStunAssistedDamage() {
        return averageStunAssistedDamage;
    }

    public void setAverageStunAssistedDamage(Float averageStunAssistedDamage) {
        this.averageStunAssistedDamage = averageStunAssistedDamage;
    }

    public Float getAverageCapturePoints() {
        return averageCapturePoints;
    }

    public void setAverageCapturePoints(Float averageCapturePoints) {
        this.averageCapturePoints = averageCapturePoints;
    }

    public Float getAverageDroppedCapturePoints() {
        return averageDroppedCapturePoints;
    }

    public void setAverageDroppedCapturePoints(Float averageDroppedCapturePoints) {
        this.averageDroppedCapturePoints = averageDroppedCapturePoints;
    }

    public Float getAverageSpotting() {
        return averageSpotting;
    }

    public void setAverageSpotting(Float averageSpotting) {
        this.averageSpotting = averageSpotting;
    }
}
