package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object auth_url
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object tokenaut
     
    /**
     * <p></p>
     */
    public static Object idPi
     
    /**
     * <p></p>
     */
    public static Object timezone
     
    /**
     * <p></p>
     */
    public static Object notePi
     
    /**
     * <p></p>
     */
    public static Object datetime
     
    /**
     * <p></p>
     */
    public static Object notePo
     
    /**
     * <p></p>
     */
    public static Object id
     
    /**
     * <p></p>
     */
    public static Object firstName
     
    /**
     * <p></p>
     */
    public static Object middleName
     
    /**
     * <p></p>
     */
    public static Object lastName
     
    /**
     * <p></p>
     */
    public static Object code
     
    /**
     * <p></p>
     */
    public static Object reg_url
     
    /**
     * <p></p>
     */
    public static Object dob
     
    /**
     * <p></p>
     */
    public static Object licenseNumber
     
    /**
     * <p></p>
     */
    public static Object licenseExpDate
     
    /**
     * <p></p>
     */
    public static Object marital
     
    /**
     * <p></p>
     */
    public static Object gender
     
    /**
     * <p></p>
     */
    public static Object otherid
     
    /**
     * <p></p>
     */
    public static Object nationality
     
    /**
     * <p></p>
     */
    public static Object inusername
     
    /**
     * <p></p>
     */
    public static Object inpassword
     
    /**
     * <p></p>
     */
    public static Object inid
     
    /**
     * <p></p>
     */
    public static Object ncode
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            auth_url = selectedVariables['auth_url']
            url = selectedVariables['url']
            username = selectedVariables['username']
            password = selectedVariables['password']
            tokenaut = selectedVariables['tokenaut']
            idPi = selectedVariables['idPi']
            timezone = selectedVariables['timezone']
            notePi = selectedVariables['notePi']
            datetime = selectedVariables['datetime']
            notePo = selectedVariables['notePo']
            id = selectedVariables['id']
            firstName = selectedVariables['firstName']
            middleName = selectedVariables['middleName']
            lastName = selectedVariables['lastName']
            code = selectedVariables['code']
            reg_url = selectedVariables['reg_url']
            dob = selectedVariables['dob']
            licenseNumber = selectedVariables['licenseNumber']
            licenseExpDate = selectedVariables['licenseExpDate']
            marital = selectedVariables['marital']
            gender = selectedVariables['gender']
            otherid = selectedVariables['otherid']
            nationality = selectedVariables['nationality']
            inusername = selectedVariables['inusername']
            inpassword = selectedVariables['inpassword']
            inid = selectedVariables['inid']
            ncode = selectedVariables['ncode']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
