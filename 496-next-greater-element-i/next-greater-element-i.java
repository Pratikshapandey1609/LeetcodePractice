// import java.util.Stack;

// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
//         int[] nextGrater = new int[nums2.length]; 
//         Stack<Integer> stack = new Stack<>();

//         for (int i = nums2.length - 1; i >= 0; i--) {
//             int res = nums2[i];

//             if (stack.isEmpty()) {
//                 stack.push(res);
//                 nextGrater[i] = -1;
//                 continue;
//             }

//             if (stack.peek() > res) {
//                 stack.push(res);
//                 nextGrater[i] = stack.peek();
//                 continue;
//             }

//             while (!stack.isEmpty() && stack.peek() <= res) {
//                 stack.pop();
//             }

//             if (stack.isEmpty()) {
//                 nextGrater[i] = -1;
//             } else {
//                 nextGrater[i] = stack.peek();
//             }

//             stack.push(res);
//         }
//         return nextGrater; 
//     }
// }


import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();


        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];

            while (!stack.isEmpty() && stack.peek() <= element) {
                stack.pop();
            }

            map.put(element, stack.isEmpty() ? -1 : stack.peek());
            stack.push(element);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]); 
        }

        return result;
    }
}