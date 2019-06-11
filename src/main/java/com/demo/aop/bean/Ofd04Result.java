package com.demo.aop.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 交易确认
 *
 * @author zhangyunhao
 * @date 2018/8/14.
 */
@TableName("fund_ta_ofd_04")
public class Ofd04Result implements Serializable {

    private static final long serialVersionUID = 3977414770487898432L;

    @TableId(type = IdType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 申请单编号
     */
    private String appSheetSerialNo;
    /**
     * 交易确认日期
     */
    private String transactionCfmDate;
    /**
     * 结算币种
     */
    private String currencyType;
    /**
     * 基金账户交易确认份数
     */
    private BigDecimal confirmedVol;
    /**
     * 每笔交易确认金额
     */
    private BigDecimal confirmedAmount;
    /**
     * 基金代码
     */
    private String fundCode;
    /**
     * 巨额赎回处理标志
     * 0-取消
     * 1-顺延
     */
    private String largeRedemptionFlag;
    /**
     * 交易发生日期
     */
    private String transactionDate;
    /**
     * 交易发生时间
     */
    private String transactionTime;
    /**
     * 交易处理返回代码
     */
    private String returnCode;
    /**
     * 投资人基金交易帐号
     */
    private String transactionAccountId;
    /**
     * 销售人代码
     */
    private String distributorCode;
    /**
     * 申请基金份数
     */
    private BigDecimal applicationVol;
    /**
     * 申请金额
     */
    private BigDecimal applicationAmount;
    /**
     * 业务代码
     */
    private String businessCode;
    /**
     * 投资人基金帐号
     */
    private String taAccountId;
    /**
     * TA确认交易流水号
     */
    private String taSerialNo;
    /**
     * 业务过程完全结束标识
     * 0-中间过程
     * 1-业务过程结束
     */
    private String businessFinishFlag;
    /**
     * 销售佣金折扣率
     */
    private BigDecimal discountRateOfCommission;
    /**
     * 投资人在销售人处用于交易的资金帐号
     */
    private String depositAcct;
    /**
     * 交易所在地区编号
     */
    private String regionCode;
    /**
     * 交易数据下传日期
     */
    private String downloaddate;
    /**
     * 手续费
     */
    private BigDecimal charge;
    /**
     * 代理费
     */
    private BigDecimal agencyFee;
    /**
     * 基金单位净值
     */
    private BigDecimal nav;
    /**
     * 网点号码
     */
    private String branchCode;
    /**
     * 原申请单编号
     */
    private String originalAppSheetNo;
    /**
     * 原申购日期
     */
    private String originalSubsDate;
    /**
     * 其他费用1
     */
    private BigDecimal otherFee1;
    /**
     * 个人/机构标志
     * 0-机构
     * 1-个人
     * 2-产品
     */
    private String individualOrInstitution;
    /**
     * 预约赎回日期
     */
    private String redemptionDateInAdvance;
    /**
     * 印花税
     */
    private BigDecimal stampDuty;
    /**
     * 交易申请有效天数
     */
    private Integer validPeriod;
    /**
     * 费率
     */
    private BigDecimal rateFee;
    /**
     * 交易后端收费总额
     */
    private BigDecimal totalBackendLoad;
    /**
     * TA的原确认流水号
     */
    private String originalSerialNo;
    /**
     * 摘要/说明
     */
    private String specification;
    /**
     * 定期定额申购日期
     */
    private String dateOfPeriodicSubs;
    /**
     * 对方销售人代码
     */
    private String targetDistributorCode;
    /**
     * 对方网点号
     */
    private String targetBranchCode;
    /**
     * 对方销售人处投资人基金交易帐号
     */
    private String targetTransactionAccountId;
    /**
     * 对方所在地区编号
     */
    private String targetRegionCode;
    /**
     * 转入/转出标识
     * 0-转出
     * 1-转入
     */
    private String transferDirection;
    /**
     * 默认分红方式
     * 0－红利转投
     * 1-现金分红
     */
    private String defDividendMethod;
    /**
     * 红利比例
     */
    private BigDecimal dividendRatio;
    /**
     * 基金账户利息金额
     */
    private BigDecimal interest;
    /**
     * 利息产生的基金份数
     */
    private BigDecimal volumeByInterest;
    /**
     * 利息税
     */
    private BigDecimal interestTax;
    /**
     * 交易价格
     */
    private BigDecimal tradingPrice;
    /**
     * 冻结截止日期
     */
    private String freezingDeadline;
    /**
     * 冻结原因
     * 0-司法冻结
     * 1-柜台冻结
     * 2-质押冻结
     * 3-质押、司法双重冻结
     * 4-柜台、司法双重冻结
     */
    private String frozenCause;
    /**
     * 税金
     */
    private BigDecimal tax;
    /**
     * 目标基金的单位净值
     */
    private BigDecimal targetNav;
    /**
     * 目标基金的价格
     */
    private BigDecimal targetFundPrice;
    /**
     * 目标基金的确认份数
     */
    private BigDecimal cfmVolOfTargetFund;
    /**
     * 最少收费
     */
    private BigDecimal minFee;
    /**
     * 其他费用2
     */
    private BigDecimal otherFee2;
    /**
     * 原申请日期
     */
    private String originalAppDate;
    /**
     * 过户费
     */
    private BigDecimal transferFee;
    /**
     * 是否注册登记人发起业务标志
     * 0-由销售人发起，
     * 1-由注册登记人发起
     */
    private String fromTaFlag;
    /**
     * 收费类别
     * 0-前收费
     * 1-后收费
     */
    private String shareClass;
    /**
     * 数据明细标志
     * 0-非明细
     * 1-明细
     */
    private String detailFlag;
    /**
     * 预约赎回标志
     * 0-非预约赎回
     * 1-预约赎回
     */
    private String redemptionInAdvanceFlag;
    /**
     * 冻结方式
     * 0-原份数冻结
     * 1-原份数+滋息冻结
     */
    private String frozenMethod;
    /**
     * TA的原确认日期
     */
    private String originalCfmDate;
    /**
     * 强行赎回原因
     * 0-小于最低持有数
     * 1-司法执行
     * 2-政策原因
     * 3-全份额快速过户后强制结转收益并强赎
     */
    private String redemptionReason;
    /**
     * 转换时的目标基金代码
     */
    private String codeOfTargetFund;
    /**
     * 交易确认费用合计
     */
    private BigDecimal totalTransFee;
    /**
     * 定时定额品种代码
     */
    private String varietyCodeOfPeriodicSubs;
    /**
     * 定时定额申购序号
     */
    private String serialNoOfPeriodicSubs;
    /**
     * 定期定额种类
     * 0-定期定额申购
     * 1-定期不定额申购
     * 2-定额不定期申购
     * 3-不定额不定期申购
     */
    private String rationType;
    /**
     * 对方基金账号
     */
    private String targetTaAccountId;
    /**
     * 对方TA代码
     */
    private String targetRegistrarCode;
    /**
     * 操作（清算）网点编号
     */
    private String netNo;
    /**
     * TA客户编号
     */
    private String customerNo;
    /**
     * 对方基金份额类别
     * 0-前收费
     * 1-后收费
     */
    private String targetShareType;
    /**
     * 定期定额协议号
     */
    private String rationProtocolNo;
    /**
     * 定时定额申购起始日期
     */
    private String beginDateOfPeriodicSubs;
    /**
     * 定时定额申购终止日期
     */
    private String enddateOfPeriodicSubs;
    /**
     * 定时定额申购每月发送日
     */
    private Integer senddayOfPeriodicSubs;
    /**
     * 经纪人
     */
    private String broker;
    /**
     * 促销活动代码
     */
    private String salesPromotion;
    /**
     * 受理方式
     * 0-柜台
     * 1-电话
     * 2-网上
     * 3-自助
     * 4-传真
     * 5-其他
     */
    private String acceptMethod;
    /**
     * 强制赎回类型
     * 0-强制赎回
     * 1-违约赎回
     * 2-到期
     */
    private String forceRedemptionType;
    /**
     * 最后更新日
     */
    private String alternationDate;
    /**
     * 带走收益标志
     * 0-不带走
     * 1-带走
     */
    private String takeIncomeFlag;
    /**
     * 定投目的
     */
    private String purposeOfPesubs;
    /**
     * 定投频率
     */
    private Integer frequencyOfPesubs;
    /**
     * 定投周期单位
     */
    private String periodSubTimeUnit;
    /**
     * 定投期数
     */
    private BigDecimal batchNumOfPesubs;
    /**
     * 资金方式
     * 1：普通方式 2：兴业银基通 3：银联通 4：工行网银
     * 5：好易联 6：汇付天下 7：工行银基通 8：好易联托收
     * 9：银行代扣款 A：农行网银 B：建行网银 C：交行网银
     * D：北京银行 E：支付宝 F：浦发网银 G：招行网银
     * H：开联网银 I：富友 J：民生网银 K：网下转账
     * L：平安网银 M：通联 N：中行网银 P：易宝 Q：财富通
     */
    private String capitalMode;
    /**
     * 明细资金方式
     */
    private String detailCapticalMode;
    /**
     * 补差费折扣率
     */
    private BigDecimal backenloadDiscount;
    /**
     * 组合编号
     */
    private String combineNum;
    /**
     * 退款金额
     */
    private BigDecimal refundAmount;
    /**
     * 配售比例
     */
    private BigDecimal salePercent;
    /**
     * 实际计算折扣
     */
    private BigDecimal managerRealRatio;
    /**
     * 转换费
     */
    private BigDecimal changeFee;
    /**
     * 补差费
     */
    private BigDecimal recuperateFee;
    /**
     * 业绩报酬
     */
    private BigDecimal achievementPay;
    /**
     * 业绩补偿
     */
    private BigDecimal achievementCompen;
    /**
     * 份额强制调整标志
     * 0-柜台业务 1-管理人批量调整 2-管理人普通调整 3-ETF份额标准化
     * 4-货币基金收益结转 5-基金分拆 6-确权 7-挂失换新号 8-基金升降级
     * 9-净值调整 A-业绩报酬 B-业绩补偿 C-联名卡还款份额调整 D-基金展期份额调整
     */
    private String sharesAdjustmentFlag;
    /**
     * 总TA确认流水号
     */
    private String generalTaSerialNo;
    /**
     * 货币基金未付收益金额
     */
    private BigDecimal undistributeMonetaryIncome;
    /**
     * 货币基金未付收益金额正负
     * 0-正
     * 1-负
     */
    private String undistributeMonetaryIncomeFlag;
    /**
     * 违约金
     */
    private BigDecimal breachFee;
    /**
     * 违约金归基金资产金额
     */
    private BigDecimal breachFeeBackToFund;
    /**
     * 惩罚性费用
     */
    private BigDecimal punishFee;
    /**
     * 使用的交易手段
     */
    private String tradingMethod;
    /**
     * 转换代理费
     */
    private BigDecimal changeAgencyFee;
    /**
     * 补差代理费
     */
    private BigDecimal recuperateAgencyFee;
    /**
     * 出错详细信息
     */
    private String errorDetail;
    /**
     * 巨额购买处理标志
     * 0-取消
     * 1-顺延
     */
    private String largeBuyFlag;
    /**
     * 认购期间利息
     */
    private BigDecimal raiseInterest;
    /**
     * 计费人
     */
    private String feeCalculator;
    /**
     * 份额注册日期
     */
    private String shareRegisterDate;
    /**
     * 基金冻结总份数
     */
    private BigDecimal totalFrozenVol;
    /**
     * 基金份数余额
     */
    private BigDecimal fundVolBalance;
    /**
     * 冻结金额
     */
    private BigDecimal frozenBalance;
    /**
     * 指定认购日期
     */
    private String futureSubscribeDate;
    /**
     * 清算资金经清算人划出日期
     */
    private String transferDateThroughClearingAgency;
    /**
     * TA代码
     */
    private String taCode;
    /**
     * 业务日期
     */
    private String businessDate;

    public String getAppSheetSerialNo() {
        return appSheetSerialNo;
    }

    public void setAppSheetSerialNo(String appSheetSerialNo) {
        this.appSheetSerialNo = appSheetSerialNo;
    }

    public String getTransactionCfmDate() {
        return transactionCfmDate;
    }

    public void setTransactionCfmDate(String transactionCfmDate) {
        this.transactionCfmDate = transactionCfmDate;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public BigDecimal getConfirmedVol() {
        return confirmedVol;
    }

    public void setConfirmedVol(BigDecimal confirmedVol) {
        this.confirmedVol = confirmedVol;
    }

    public BigDecimal getConfirmedAmount() {
        return confirmedAmount;
    }

    public void setConfirmedAmount(BigDecimal confirmedAmount) {
        this.confirmedAmount = confirmedAmount;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getLargeRedemptionFlag() {
        return largeRedemptionFlag;
    }

    public void setLargeRedemptionFlag(String largeRedemptionFlag) {
        this.largeRedemptionFlag = largeRedemptionFlag;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getTransactionAccountId() {
        return transactionAccountId;
    }

    public void setTransactionAccountId(String transactionAccountId) {
        this.transactionAccountId = transactionAccountId;
    }

    public String getDistributorCode() {
        return distributorCode;
    }

    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }

    public BigDecimal getApplicationVol() {
        return applicationVol;
    }

    public void setApplicationVol(BigDecimal applicationVol) {
        this.applicationVol = applicationVol;
    }

    public BigDecimal getApplicationAmount() {
        return applicationAmount;
    }

    public void setApplicationAmount(BigDecimal applicationAmount) {
        this.applicationAmount = applicationAmount;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getTaAccountId() {
        return taAccountId;
    }

    public void setTaAccountId(String taAccountId) {
        this.taAccountId = taAccountId;
    }

    public String getTaSerialNo() {
        return taSerialNo;
    }

    public void setTaSerialNo(String taSerialNo) {
        this.taSerialNo = taSerialNo;
    }

    public String getBusinessFinishFlag() {
        return businessFinishFlag;
    }

    public void setBusinessFinishFlag(String businessFinishFlag) {
        this.businessFinishFlag = businessFinishFlag;
    }

    public BigDecimal getDiscountRateOfCommission() {
        return discountRateOfCommission;
    }

    public void setDiscountRateOfCommission(BigDecimal discountRateOfCommission) {
        this.discountRateOfCommission = discountRateOfCommission;
    }

    public String getDepositAcct() {
        return depositAcct;
    }

    public void setDepositAcct(String depositAcct) {
        this.depositAcct = depositAcct;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getDownloaddate() {
        return downloaddate;
    }

    public void setDownloaddate(String downloaddate) {
        this.downloaddate = downloaddate;
    }

    public BigDecimal getCharge() {
        return charge;
    }

    public void setCharge(BigDecimal charge) {
        this.charge = charge;
    }

    public BigDecimal getAgencyFee() {
        return agencyFee;
    }

    public void setAgencyFee(BigDecimal agencyFee) {
        this.agencyFee = agencyFee;
    }

    public BigDecimal getNav() {
        return nav;
    }

    public void setNav(BigDecimal nav) {
        this.nav = nav;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getOriginalAppSheetNo() {
        return originalAppSheetNo;
    }

    public void setOriginalAppSheetNo(String originalAppSheetNo) {
        this.originalAppSheetNo = originalAppSheetNo;
    }

    public String getOriginalSubsDate() {
        return originalSubsDate;
    }

    public void setOriginalSubsDate(String originalSubsDate) {
        this.originalSubsDate = originalSubsDate;
    }

    public BigDecimal getOtherFee1() {
        return otherFee1;
    }

    public void setOtherFee1(BigDecimal otherFee1) {
        this.otherFee1 = otherFee1;
    }

    public String getIndividualOrInstitution() {
        return individualOrInstitution;
    }

    public void setIndividualOrInstitution(String individualOrInstitution) {
        this.individualOrInstitution = individualOrInstitution;
    }

    public String getRedemptionDateInAdvance() {
        return redemptionDateInAdvance;
    }

    public void setRedemptionDateInAdvance(String redemptionDateInAdvance) {
        this.redemptionDateInAdvance = redemptionDateInAdvance;
    }

    public BigDecimal getStampDuty() {
        return stampDuty;
    }

    public void setStampDuty(BigDecimal stampDuty) {
        this.stampDuty = stampDuty;
    }

    public Integer getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(Integer validPeriod) {
        this.validPeriod = validPeriod;
    }

    public BigDecimal getRateFee() {
        return rateFee;
    }

    public void setRateFee(BigDecimal rateFee) {
        this.rateFee = rateFee;
    }

    public BigDecimal getTotalBackendLoad() {
        return totalBackendLoad;
    }

    public void setTotalBackendLoad(BigDecimal totalBackendLoad) {
        this.totalBackendLoad = totalBackendLoad;
    }

    public String getOriginalSerialNo() {
        return originalSerialNo;
    }

    public void setOriginalSerialNo(String originalSerialNo) {
        this.originalSerialNo = originalSerialNo;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getDateOfPeriodicSubs() {
        return dateOfPeriodicSubs;
    }

    public void setDateOfPeriodicSubs(String dateOfPeriodicSubs) {
        this.dateOfPeriodicSubs = dateOfPeriodicSubs;
    }

    public String getTargetDistributorCode() {
        return targetDistributorCode;
    }

    public void setTargetDistributorCode(String targetDistributorCode) {
        this.targetDistributorCode = targetDistributorCode;
    }

    public String getTargetBranchCode() {
        return targetBranchCode;
    }

    public void setTargetBranchCode(String targetBranchCode) {
        this.targetBranchCode = targetBranchCode;
    }

    public String getTargetTransactionAccountId() {
        return targetTransactionAccountId;
    }

    public void setTargetTransactionAccountId(String targetTransactionAccountId) {
        this.targetTransactionAccountId = targetTransactionAccountId;
    }

    public String getTargetRegionCode() {
        return targetRegionCode;
    }

    public void setTargetRegionCode(String targetRegionCode) {
        this.targetRegionCode = targetRegionCode;
    }

    public String getTransferDirection() {
        return transferDirection;
    }

    public void setTransferDirection(String transferDirection) {
        this.transferDirection = transferDirection;
    }

    public String getDefDividendMethod() {
        return defDividendMethod;
    }

    public void setDefDividendMethod(String defDividendMethod) {
        this.defDividendMethod = defDividendMethod;
    }

    public BigDecimal getDividendRatio() {
        return dividendRatio;
    }

    public void setDividendRatio(BigDecimal dividendRatio) {
        this.dividendRatio = dividendRatio;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getVolumeByInterest() {
        return volumeByInterest;
    }

    public void setVolumeByInterest(BigDecimal volumeByInterest) {
        this.volumeByInterest = volumeByInterest;
    }

    public BigDecimal getInterestTax() {
        return interestTax;
    }

    public void setInterestTax(BigDecimal interestTax) {
        this.interestTax = interestTax;
    }

    public BigDecimal getTradingPrice() {
        return tradingPrice;
    }

    public void setTradingPrice(BigDecimal tradingPrice) {
        this.tradingPrice = tradingPrice;
    }

    public String getFreezingDeadline() {
        return freezingDeadline;
    }

    public void setFreezingDeadline(String freezingDeadline) {
        this.freezingDeadline = freezingDeadline;
    }

    public String getFrozenCause() {
        return frozenCause;
    }

    public void setFrozenCause(String frozenCause) {
        this.frozenCause = frozenCause;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTargetNav() {
        return targetNav;
    }

    public void setTargetNav(BigDecimal targetNav) {
        this.targetNav = targetNav;
    }

    public BigDecimal getTargetFundPrice() {
        return targetFundPrice;
    }

    public void setTargetFundPrice(BigDecimal targetFundPrice) {
        this.targetFundPrice = targetFundPrice;
    }

    public BigDecimal getCfmVolOfTargetFund() {
        return cfmVolOfTargetFund;
    }

    public void setCfmVolOfTargetFund(BigDecimal cfmVolOfTargetFund) {
        this.cfmVolOfTargetFund = cfmVolOfTargetFund;
    }

    public BigDecimal getMinFee() {
        return minFee;
    }

    public void setMinFee(BigDecimal minFee) {
        this.minFee = minFee;
    }

    public BigDecimal getOtherFee2() {
        return otherFee2;
    }

    public void setOtherFee2(BigDecimal otherFee2) {
        this.otherFee2 = otherFee2;
    }

    public String getOriginalAppDate() {
        return originalAppDate;
    }

    public void setOriginalAppDate(String originalAppDate) {
        this.originalAppDate = originalAppDate;
    }

    public BigDecimal getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(BigDecimal transferFee) {
        this.transferFee = transferFee;
    }

    public String getFromTaFlag() {
        return fromTaFlag;
    }

    public void setFromTaFlag(String fromTaFlag) {
        this.fromTaFlag = fromTaFlag;
    }

    public String getShareClass() {
        return shareClass;
    }

    public void setShareClass(String shareClass) {
        this.shareClass = shareClass;
    }

    public String getDetailFlag() {
        return detailFlag;
    }

    public void setDetailFlag(String detailFlag) {
        this.detailFlag = detailFlag;
    }

    public String getRedemptionInAdvanceFlag() {
        return redemptionInAdvanceFlag;
    }

    public void setRedemptionInAdvanceFlag(String redemptionInAdvanceFlag) {
        this.redemptionInAdvanceFlag = redemptionInAdvanceFlag;
    }

    public String getFrozenMethod() {
        return frozenMethod;
    }

    public void setFrozenMethod(String frozenMethod) {
        this.frozenMethod = frozenMethod;
    }

    public String getOriginalCfmDate() {
        return originalCfmDate;
    }

    public void setOriginalCfmDate(String originalCfmDate) {
        this.originalCfmDate = originalCfmDate;
    }

    public String getRedemptionReason() {
        return redemptionReason;
    }

    public void setRedemptionReason(String redemptionReason) {
        this.redemptionReason = redemptionReason;
    }

    public String getCodeOfTargetFund() {
        return codeOfTargetFund;
    }

    public void setCodeOfTargetFund(String codeOfTargetFund) {
        this.codeOfTargetFund = codeOfTargetFund;
    }

    public BigDecimal getTotalTransFee() {
        return totalTransFee;
    }

    public void setTotalTransFee(BigDecimal totalTransFee) {
        this.totalTransFee = totalTransFee;
    }

    public String getVarietyCodeOfPeriodicSubs() {
        return varietyCodeOfPeriodicSubs;
    }

    public void setVarietyCodeOfPeriodicSubs(String varietyCodeOfPeriodicSubs) {
        this.varietyCodeOfPeriodicSubs = varietyCodeOfPeriodicSubs;
    }

    public String getSerialNoOfPeriodicSubs() {
        return serialNoOfPeriodicSubs;
    }

    public void setSerialNoOfPeriodicSubs(String serialNoOfPeriodicSubs) {
        this.serialNoOfPeriodicSubs = serialNoOfPeriodicSubs;
    }

    public String getRationType() {
        return rationType;
    }

    public void setRationType(String rationType) {
        this.rationType = rationType;
    }

    public String getTargetTaAccountId() {
        return targetTaAccountId;
    }

    public void setTargetTaAccountId(String targetTaAccountId) {
        this.targetTaAccountId = targetTaAccountId;
    }

    public String getTargetRegistrarCode() {
        return targetRegistrarCode;
    }

    public void setTargetRegistrarCode(String targetRegistrarCode) {
        this.targetRegistrarCode = targetRegistrarCode;
    }

    public String getNetNo() {
        return netNo;
    }

    public void setNetNo(String netNo) {
        this.netNo = netNo;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getTargetShareType() {
        return targetShareType;
    }

    public void setTargetShareType(String targetShareType) {
        this.targetShareType = targetShareType;
    }

    public String getRationProtocolNo() {
        return rationProtocolNo;
    }

    public void setRationProtocolNo(String rationProtocolNo) {
        this.rationProtocolNo = rationProtocolNo;
    }

    public String getBeginDateOfPeriodicSubs() {
        return beginDateOfPeriodicSubs;
    }

    public void setBeginDateOfPeriodicSubs(String beginDateOfPeriodicSubs) {
        this.beginDateOfPeriodicSubs = beginDateOfPeriodicSubs;
    }

    public String getEnddateOfPeriodicSubs() {
        return enddateOfPeriodicSubs;
    }

    public void setEnddateOfPeriodicSubs(String enddateOfPeriodicSubs) {
        this.enddateOfPeriodicSubs = enddateOfPeriodicSubs;
    }

    public Integer getSenddayOfPeriodicSubs() {
        return senddayOfPeriodicSubs;
    }

    public void setSenddayOfPeriodicSubs(Integer senddayOfPeriodicSubs) {
        this.senddayOfPeriodicSubs = senddayOfPeriodicSubs;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public String getSalesPromotion() {
        return salesPromotion;
    }

    public void setSalesPromotion(String salesPromotion) {
        this.salesPromotion = salesPromotion;
    }

    public String getAcceptMethod() {
        return acceptMethod;
    }

    public void setAcceptMethod(String acceptMethod) {
        this.acceptMethod = acceptMethod;
    }

    public String getForceRedemptionType() {
        return forceRedemptionType;
    }

    public void setForceRedemptionType(String forceRedemptionType) {
        this.forceRedemptionType = forceRedemptionType;
    }

    public String getAlternationDate() {
        return alternationDate;
    }

    public void setAlternationDate(String alternationDate) {
        this.alternationDate = alternationDate;
    }

    public String getTakeIncomeFlag() {
        return takeIncomeFlag;
    }

    public void setTakeIncomeFlag(String takeIncomeFlag) {
        this.takeIncomeFlag = takeIncomeFlag;
    }

    public String getPurposeOfPesubs() {
        return purposeOfPesubs;
    }

    public void setPurposeOfPesubs(String purposeOfPesubs) {
        this.purposeOfPesubs = purposeOfPesubs;
    }

    public Integer getFrequencyOfPesubs() {
        return frequencyOfPesubs;
    }

    public void setFrequencyOfPesubs(Integer frequencyOfPesubs) {
        this.frequencyOfPesubs = frequencyOfPesubs;
    }

    public String getPeriodSubTimeUnit() {
        return periodSubTimeUnit;
    }

    public void setPeriodSubTimeUnit(String periodSubTimeUnit) {
        this.periodSubTimeUnit = periodSubTimeUnit;
    }

    public BigDecimal getBatchNumOfPesubs() {
        return batchNumOfPesubs;
    }

    public void setBatchNumOfPesubs(BigDecimal batchNumOfPesubs) {
        this.batchNumOfPesubs = batchNumOfPesubs;
    }

    public String getCapitalMode() {
        return capitalMode;
    }

    public void setCapitalMode(String capitalMode) {
        this.capitalMode = capitalMode;
    }

    public String getDetailCapticalMode() {
        return detailCapticalMode;
    }

    public void setDetailCapticalMode(String detailCapticalMode) {
        this.detailCapticalMode = detailCapticalMode;
    }

    public BigDecimal getBackenloadDiscount() {
        return backenloadDiscount;
    }

    public void setBackenloadDiscount(BigDecimal backenloadDiscount) {
        this.backenloadDiscount = backenloadDiscount;
    }

    public String getCombineNum() {
        return combineNum;
    }

    public void setCombineNum(String combineNum) {
        this.combineNum = combineNum;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getSalePercent() {
        return salePercent;
    }

    public void setSalePercent(BigDecimal salePercent) {
        this.salePercent = salePercent;
    }

    public BigDecimal getManagerRealRatio() {
        return managerRealRatio;
    }

    public void setManagerRealRatio(BigDecimal managerRealRatio) {
        this.managerRealRatio = managerRealRatio;
    }

    public BigDecimal getChangeFee() {
        return changeFee;
    }

    public void setChangeFee(BigDecimal changeFee) {
        this.changeFee = changeFee;
    }

    public BigDecimal getRecuperateFee() {
        return recuperateFee;
    }

    public void setRecuperateFee(BigDecimal recuperateFee) {
        this.recuperateFee = recuperateFee;
    }

    public BigDecimal getAchievementPay() {
        return achievementPay;
    }

    public void setAchievementPay(BigDecimal achievementPay) {
        this.achievementPay = achievementPay;
    }

    public BigDecimal getAchievementCompen() {
        return achievementCompen;
    }

    public void setAchievementCompen(BigDecimal achievementCompen) {
        this.achievementCompen = achievementCompen;
    }

    public String getSharesAdjustmentFlag() {
        return sharesAdjustmentFlag;
    }

    public void setSharesAdjustmentFlag(String sharesAdjustmentFlag) {
        this.sharesAdjustmentFlag = sharesAdjustmentFlag;
    }

    public String getGeneralTaSerialNo() {
        return generalTaSerialNo;
    }

    public void setGeneralTaSerialNo(String generalTaSerialNo) {
        this.generalTaSerialNo = generalTaSerialNo;
    }

    public BigDecimal getUndistributeMonetaryIncome() {
        return undistributeMonetaryIncome;
    }

    public void setUndistributeMonetaryIncome(BigDecimal undistributeMonetaryIncome) {
        this.undistributeMonetaryIncome = undistributeMonetaryIncome;
    }

    public String getUndistributeMonetaryIncomeFlag() {
        return undistributeMonetaryIncomeFlag;
    }

    public void setUndistributeMonetaryIncomeFlag(String undistributeMonetaryIncomeFlag) {
        this.undistributeMonetaryIncomeFlag = undistributeMonetaryIncomeFlag;
    }

    public BigDecimal getBreachFee() {
        return breachFee;
    }

    public void setBreachFee(BigDecimal breachFee) {
        this.breachFee = breachFee;
    }

    public BigDecimal getBreachFeeBackToFund() {
        return breachFeeBackToFund;
    }

    public void setBreachFeeBackToFund(BigDecimal breachFeeBackToFund) {
        this.breachFeeBackToFund = breachFeeBackToFund;
    }

    public BigDecimal getPunishFee() {
        return punishFee;
    }

    public void setPunishFee(BigDecimal punishFee) {
        this.punishFee = punishFee;
    }

    public String getTradingMethod() {
        return tradingMethod;
    }

    public void setTradingMethod(String tradingMethod) {
        this.tradingMethod = tradingMethod;
    }

    public BigDecimal getChangeAgencyFee() {
        return changeAgencyFee;
    }

    public void setChangeAgencyFee(BigDecimal changeAgencyFee) {
        this.changeAgencyFee = changeAgencyFee;
    }

    public BigDecimal getRecuperateAgencyFee() {
        return recuperateAgencyFee;
    }

    public void setRecuperateAgencyFee(BigDecimal recuperateAgencyFee) {
        this.recuperateAgencyFee = recuperateAgencyFee;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    public String getLargeBuyFlag() {
        return largeBuyFlag;
    }

    public void setLargeBuyFlag(String largeBuyFlag) {
        this.largeBuyFlag = largeBuyFlag;
    }

    public BigDecimal getRaiseInterest() {
        return raiseInterest;
    }

    public void setRaiseInterest(BigDecimal raiseInterest) {
        this.raiseInterest = raiseInterest;
    }

    public String getFeeCalculator() {
        return feeCalculator;
    }

    public void setFeeCalculator(String feeCalculator) {
        this.feeCalculator = feeCalculator;
    }

    public String getShareRegisterDate() {
        return shareRegisterDate;
    }

    public void setShareRegisterDate(String shareRegisterDate) {
        this.shareRegisterDate = shareRegisterDate;
    }

    public BigDecimal getTotalFrozenVol() {
        return totalFrozenVol;
    }

    public void setTotalFrozenVol(BigDecimal totalFrozenVol) {
        this.totalFrozenVol = totalFrozenVol;
    }

    public BigDecimal getFundVolBalance() {
        return fundVolBalance;
    }

    public void setFundVolBalance(BigDecimal fundVolBalance) {
        this.fundVolBalance = fundVolBalance;
    }

    public BigDecimal getFrozenBalance() {
        return frozenBalance;
    }

    public void setFrozenBalance(BigDecimal frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public String getFutureSubscribeDate() {
        return futureSubscribeDate;
    }

    public void setFutureSubscribeDate(String futureSubscribeDate) {
        this.futureSubscribeDate = futureSubscribeDate;
    }

    public String getTransferDateThroughClearingAgency() {
        return transferDateThroughClearingAgency;
    }

    public void setTransferDateThroughClearingAgency(String transferDateThroughClearingAgency) {
        this.transferDateThroughClearingAgency = transferDateThroughClearingAgency;
    }

    public String getTaCode() {
        return taCode;
    }

    public void setTaCode(String taCode) {
        this.taCode = taCode;
    }

    public String getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate;
    }
}