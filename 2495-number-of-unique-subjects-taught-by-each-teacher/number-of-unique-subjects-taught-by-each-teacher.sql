# Write your MySQL query statement below
SELECT teacher_id,COUNT(teacher_id) AS cnt FROM (SELECT teacher_id,count(subject_id) FROM Teacher GROUP BY teacher_id,subject_id) AS teach GROUP BY teacher_id;