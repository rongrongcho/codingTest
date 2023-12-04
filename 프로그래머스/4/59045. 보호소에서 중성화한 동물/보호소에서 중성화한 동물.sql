SELECT
    A.ANIMAL_ID,
    A.ANIMAL_TYPE,
    A.NAME
FROM
    ANIMAL_INS A
    JOIN ANIMAL_OUTS O ON A.ANIMAL_ID = O.ANIMAL_ID
WHERE
    A.SEX_UPON_INTAKE LIKE 'Intact%'
    AND O.SEX_UPON_OUTCOME LIKE 'Spayed%'
    OR A.SEX_UPON_INTAKE LIKE 'Intact%'
    AND O.SEX_UPON_OUTCOME LIKE 'Neutered%'
ORDER BY
    A.ANIMAL_ID;
