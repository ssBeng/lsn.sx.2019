package com.briup.apps.app02.bean;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_user.id
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_user.realname
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_user.telephone
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_user.password
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_user.gender
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_user.type
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_user.status
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_user.id
     *
     * @return the value of sms_user.id
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_user.id
     *
     * @param id the value for sms_user.id
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_user.realname
     *
     * @return the value of sms_user.realname
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_user.realname
     *
     * @param realname the value for sms_user.realname
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_user.telephone
     *
     * @return the value of sms_user.telephone
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_user.telephone
     *
     * @param telephone the value for sms_user.telephone
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_user.password
     *
     * @return the value of sms_user.password
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_user.password
     *
     * @param password the value for sms_user.password
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_user.gender
     *
     * @return the value of sms_user.gender
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_user.gender
     *
     * @param gender the value for sms_user.gender
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_user.type
     *
     * @return the value of sms_user.type
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_user.type
     *
     * @param type the value for sms_user.type
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_user.status
     *
     * @return the value of sms_user.status
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_user.status
     *
     * @param status the value for sms_user.status
     *
     * @mbg.generated Mon Jun 10 09:20:01 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}