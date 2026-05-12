def expect(val):
    def to_be(val2):
        if val == val2:
            return True
        else:
            raise Exception("Not Equal")

    def not_to_be(val2):
        if val != val2:
            return True
        else:
            raise Exception("Equal")

    return {
        "to_be": to_be,
        "not_to_be": not_to_be
    }
