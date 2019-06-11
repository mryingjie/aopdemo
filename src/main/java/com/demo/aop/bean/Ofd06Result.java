package com.demo.aop.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

@TableName("fund_ta_ofd_06")
public class Ofd06Result implements Serializable {
    private static final long serialVersionUID = -4678299640605580338L;
    @TableId(type = IdType.AUTO)
    private Long id;
    private BigDecimal basisForCalculatingDividend;
    private String transactionCfmDate;
    private String currencyType;
    private BigDecimal volOfDividendforReinvestment;
    private String dividentDate;
    private BigDecimal dividendAmount;
    private String xrDate;
    private BigDecimal confirmedAmount;
    private String fundCode;
    private String registrationDate;
    private String returnCode;
    private String transactionAccountId;
    private String distributorCode;
    private String businessCode;
    private String taAccountId;
    private BigDecimal dividendPerUnit;
    private String defdividendMethod;
    private String depositAcct;
    private String regionCode;
    private String downloadDate;
    private BigDecimal charge;
    private BigDecimal agencyFee;
    private BigDecimal totalFrozenVol;
    private BigDecimal nav;
    private String branchCode;
    private BigDecimal otherFee1;
    private BigDecimal otherFee2;
    private String individualOrInstitution;
    private BigDecimal dividendRatio;
    private String taSerialNo;
    private BigDecimal stampDuty;
    private BigDecimal frozenBalance;
    private BigDecimal transferFee;
    private String shareClass;
    private String feeCalculator;
    private Long drawBonusUnit;
    private BigDecimal frozenSharesforReinvest;
    private String dividendType;
    private String originalAppSheetNo;
    private BigDecimal achievementPay;
    private BigDecimal achievementCompen;
    private String taCode;
    private String businessDate;

    public Ofd06Result() {
    }

    public BigDecimal getBasisForCalculatingDividend() {
        return this.basisForCalculatingDividend;
    }

    public void setBasisForCalculatingDividend(BigDecimal basisForCalculatingDividend) {
        this.basisForCalculatingDividend = basisForCalculatingDividend;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionCfmDate() {
        return this.transactionCfmDate;
    }

    public void setTransactionCfmDate(String transactionCfmDate) {
        this.transactionCfmDate = transactionCfmDate;
    }

    public String getCurrencyType() {
        return this.currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public BigDecimal getVolOfDividendforReinvestment() {
        return this.volOfDividendforReinvestment;
    }

    public void setVolOfDividendforReinvestment(BigDecimal volOfDividendforReinvestment) {
        this.volOfDividendforReinvestment = volOfDividendforReinvestment;
    }

    public String getDividentDate() {
        return this.dividentDate;
    }

    public void setDividentDate(String dividentDate) {
        this.dividentDate = dividentDate;
    }

    public BigDecimal getDividendAmount() {
        return this.dividendAmount;
    }

    public void setDividendAmount(BigDecimal dividendAmount) {
        this.dividendAmount = dividendAmount;
    }

    public String getXrDate() {
        return this.xrDate;
    }

    public void setXrDate(String xrDate) {
        this.xrDate = xrDate;
    }

    public BigDecimal getConfirmedAmount() {
        return this.confirmedAmount;
    }

    public void setConfirmedAmount(BigDecimal confirmedAmount) {
        this.confirmedAmount = confirmedAmount;
    }

    public String getFundCode() {
        return this.fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getReturnCode() {
        return this.returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getTransactionAccountId() {
        return this.transactionAccountId;
    }

    public void setTransactionAccountId(String transactionAccountId) {
        this.transactionAccountId = transactionAccountId;
    }

    public String getDistributorCode() {
        return this.distributorCode;
    }

    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }

    public String getBusinessCode() {
        return this.businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getTaAccountId() {
        return this.taAccountId;
    }

    public void setTaAccountId(String taAccountId) {
        this.taAccountId = taAccountId;
    }

    public BigDecimal getDividendPerUnit() {
        return this.dividendPerUnit;
    }

    public void setDividendPerUnit(BigDecimal dividendPerUnit) {
        this.dividendPerUnit = dividendPerUnit;
    }

    public String getDefdividendMethod() {
        return this.defdividendMethod;
    }

    public void setDefdividendMethod(String defdividendMethod) {
        this.defdividendMethod = defdividendMethod;
    }

    public String getDepositAcct() {
        return this.depositAcct;
    }

    public void setDepositAcct(String depositAcct) {
        this.depositAcct = depositAcct;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getDownloadDate() {
        return this.downloadDate;
    }

    public void setDownloadDate(String downloadDate) {
        this.downloadDate = downloadDate;
    }

    public BigDecimal getCharge() {
        return this.charge;
    }

    public void setCharge(BigDecimal charge) {
        this.charge = charge;
    }

    public BigDecimal getAgencyFee() {
        return this.agencyFee;
    }

    public void setAgencyFee(BigDecimal agencyFee) {
        this.agencyFee = agencyFee;
    }

    public BigDecimal getTotalFrozenVol() {
        return this.totalFrozenVol;
    }

    public void setTotalFrozenVol(BigDecimal totalFrozenVol) {
        this.totalFrozenVol = totalFrozenVol;
    }

    public BigDecimal getNav() {
        return this.nav;
    }

    public void setNav(BigDecimal nav) {
        this.nav = nav;
    }

    public String getBranchCode() {
        return this.branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public BigDecimal getOtherFee1() {
        return this.otherFee1;
    }

    public void setOtherFee1(BigDecimal otherFee1) {
        this.otherFee1 = otherFee1;
    }

    public BigDecimal getOtherFee2() {
        return this.otherFee2;
    }

    public void setOtherFee2(BigDecimal otherFee2) {
        this.otherFee2 = otherFee2;
    }

    public String getIndividualOrInstitution() {
        return this.individualOrInstitution;
    }

    public void setIndividualOrInstitution(String individualOrInstitution) {
        this.individualOrInstitution = individualOrInstitution;
    }

    public BigDecimal getDividendRatio() {
        return this.dividendRatio;
    }

    public void setDividendRatio(BigDecimal dividendRatio) {
        this.dividendRatio = dividendRatio;
    }

    public String getTaSerialNo() {
        return this.taSerialNo;
    }

    public void setTaSerialNo(String taSerialNo) {
        this.taSerialNo = taSerialNo;
    }

    public BigDecimal getStampDuty() {
        return this.stampDuty;
    }

    public void setStampDuty(BigDecimal stampDuty) {
        this.stampDuty = stampDuty;
    }

    public BigDecimal getFrozenBalance() {
        return this.frozenBalance;
    }

    public void setFrozenBalance(BigDecimal frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public BigDecimal getTransferFee() {
        return this.transferFee;
    }

    public void setTransferFee(BigDecimal transferFee) {
        this.transferFee = transferFee;
    }

    public String getShareClass() {
        return this.shareClass;
    }

    public void setShareClass(String shareClass) {
        this.shareClass = shareClass;
    }

    public String getFeeCalculator() {
        return this.feeCalculator;
    }

    public void setFeeCalculator(String feeCalculator) {
        this.feeCalculator = feeCalculator;
    }

    public Long getDrawBonusUnit() {
        return this.drawBonusUnit;
    }

    public void setDrawBonusUnit(Long drawBonusUnit) {
        this.drawBonusUnit = drawBonusUnit;
    }

    public BigDecimal getFrozenSharesforReinvest() {
        return this.frozenSharesforReinvest;
    }

    public void setFrozenSharesforReinvest(BigDecimal frozenSharesforReinvest) {
        this.frozenSharesforReinvest = frozenSharesforReinvest;
    }

    public String getDividendType() {
        return this.dividendType;
    }

    public void setDividendType(String dividendType) {
        this.dividendType = dividendType;
    }

    public String getOriginalAppSheetNo() {
        return this.originalAppSheetNo;
    }

    public void setOriginalAppSheetNo(String originalAppSheetNo) {
        this.originalAppSheetNo = originalAppSheetNo;
    }

    public BigDecimal getAchievementPay() {
        return this.achievementPay;
    }

    public void setAchievementPay(BigDecimal achievementPay) {
        this.achievementPay = achievementPay;
    }

    public BigDecimal getAchievementCompen() {
        return this.achievementCompen;
    }

    public void setAchievementCompen(BigDecimal achievementCompen) {
        this.achievementCompen = achievementCompen;
    }

    public String getTaCode() {
        return this.taCode;
    }

    public void setTaCode(String taCode) {
        this.taCode = taCode;
    }

    public String getBusinessDate() {
        return this.businessDate;
    }

    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate;
    }
}
