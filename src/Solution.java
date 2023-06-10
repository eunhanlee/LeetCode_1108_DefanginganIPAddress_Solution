class Solution {

    /**
     * Replaces the periods in the given IP address with the specified replacement string.
     *
     * @param address the IP address to modify
     * @return the modified IP address
     **/
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
