# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        if not head or not head.next:
            return

        slo = head
        fast = head
        while fast.next and fast.next.next:
            slo = slo.next
            fast = fast.next.next
        
        sec = slo.next
        slo.next = None

        prev = None
        while sec:
            temp = sec.next
            sec.next = prev
            prev = sec
            sec = temp
        sec = prev

        first = head
        while sec:
            temp1 = first.next
            temp2 = sec.next
            first.next = sec
            sec.next = temp1
            first = temp1
            sec = temp2

        