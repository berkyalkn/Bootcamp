##--------------------Question 1------------------------

def flatten(inputList) :

    outputList = []
    for x in inputList :
        if isinstance(x, list):
            outputList.extend(flatten(x))
        else :
            outputList.append(x)

    return outputList

inputList = [[1,'a',['cat'],2],[[[3]],'dog'],4,5]
outputList = flatten(inputList)

print(outputList)


#----------------------Question 2-------------------------

def reverse(inputList) :

    return [subList[::-1] for subList in inputList[::-1]]


inputList =  [[1, 2], [3, 4], [5, 6, 7]]
outputList = reverse(inputList)

print(outputList)