/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    int s=0;
    while(head!=NULL)
    {
        s=s*2+head->val;
        head=head->next;
    }
    
    return s;
}