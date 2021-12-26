// https://practice.geeksforgeeks.org/problems/temple-offerings2831/1#

/*

Consider a devotee wishing to give offerings to temples along a mountain range. 
The temples are located in a row at different heights. Devotee is very religious and wants to offer each temple at least one offering. 
If two adjacent temples are at different altitudes, then the temple that is higher up should receive more offerings than the one that is at lower altitude. 
If two adjacent temples are at the same height, then their offerings relative to each other does not matter. 
The height of the N temples are given in the array arr[]. Find the minimum number of offerings required

*/
import java.io.*;
import java.util.*;


class Solution{
    int offerings(int n, int arr[]){
        
        int[] larr = new int[arr.length];
        int[] rarr = new int[arr.length];
        larr[0] = 1;
        rarr[arr.length - 1] = 1;
        int ans = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i - 1]){
                larr[i] = larr[i - 1] + 1;
            } else {
                larr[i] = 1;
            }
        }
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] > arr[i + 1]){
                rarr[i] = rarr[i + 1] + 1;
            } else {
                rarr[i] = 1;
            }
        }
        for(int i = 0; i < arr.length; i++){
            ans += Math.max(larr[i], rarr[i]);
        }
        return ans;
    }
}