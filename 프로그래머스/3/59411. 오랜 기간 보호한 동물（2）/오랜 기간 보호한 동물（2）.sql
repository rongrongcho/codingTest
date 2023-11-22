select animal_id, name
from (
    SELECT A.ANIMAL_ID, A.NAME
    from ANIMAL_INS A
    join ANIMAL_OUTS B
    on A.ANIMAL_ID = B.ANIMAL_ID
    order by B.DATETIME - A.DATETIME desc
)
where rownum <= 2
