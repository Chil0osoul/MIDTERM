# Program 1

message = "Hello Python"

bytes_obj = message.encode('utf-8')
print(f"1. Bytes to object: {bytes_obj}")

string_obj = bytes_obj.decode('utf-8')
print(f"2. Bytes to string: {string_obj}")

hex_string = bytes_obj.hex()
print(f"3. Hexadecimal string: {hex_string}")

bytes_from_hex = bytes.fromhex(hex_string)
print(f"4. Hexadecimal to bytes: {bytes_from_hex}")

bytearray_direct = bytearray(message, 'utf-8')
print(f"5. Bytearray from string: {bytearray_direct}")

bytearray_from_bytes = bytearray(bytes_obj)
print(f"6. Bytearray from bytes: {bytearray_from_bytes}")

sliced_bytes = bytes_obj[6:]
print(f"7. Sliced bytes: {sliced_bytes}")

bytearray_from_bytes[0] = ord('h')
decoded_modified = bytearray_from_bytes.decode('utf-8')
print(f"8. Modified bytearray: {decoded_modified}\n\n")

# Program 2

first_name = input("Enter your first name: ")
last_name = input("Enter your last name: ")
print(f"First Name: {first_name}")
print(f"Last Name: {last_name}")

full_name = first_name + " " + last_name
print(f"Full Name: {full_name}")


first_char = full_name[0]
last_char = full_name[-1]
print(f"First character: '{first_char}'")
print(f"Last character: '{last_char}'")

try:
    first_name[0] = "D"
except TypeError as error:
    print(f"Caught Error: {error}")
    print("Strings are immutable; individual characters ")
    print("cannot be changed ")
new_name = "D" + first_name[1:]
print(f"New string created: {new_name}")
print(f"Original string remains unchanged: {first_name}")

print("Characters in full name:")
for char in full_name:
    print(char)

sliced_first = full_name[0:len(first_name)] 
sliced_last = full_name[len(first_name)+1:len(full_name)]   
print(f"Extracted First Name: {sliced_first}")
print(f"Extracted Last Name: {sliced_last}")

user_input = input("Enter a single character to search for: ")
if len(user_input) != 1:
    print("Error: Please restart and input exactly one character.")
else:

    if user_input in full_name:
        index = full_name.find(user_input)
        print(f"The first index position is: {index}")
    else:
        print(f"'{user_input}' was not found in '{full_name}'.")
