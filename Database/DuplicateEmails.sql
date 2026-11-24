-- LeetCode 182: Duplicate Emails
-- URL: https://leetcode.com/problems/duplicate-emails/
-- Difficulty: Easy
--
-- Table: Person
-- +-------------+---------+
-- | Column Name | Type    |
-- +-------------+---------+
-- | id          | int     |
-- | email       | varchar |
-- +-------------+---------+

SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
